from fastapi import FastAPI, File, Form, UploadFile, Request
from fastapi.responses import HTMLResponse
from fastapi.staticfiles import StaticFiles 
from fastapi.templating import Jinja2Templates 
import pymysql

conn = pymysql.connect(host='localhost', user='root', password='python', port=3305,
                       db='python', charset='utf8')
 

curs = conn.cursor(pymysql.cursors.DictCursor)
# 연관배열

sql = "select * from emp"
curs.execute(sql)
 
rows = curs.fetchall()
# print(rows)    


app = FastAPI()

app.mount("/static", StaticFiles(directory="static"), name="static") 

templates = Jinja2Templates(directory="templates")

@app.get("/hello", response_class=HTMLResponse)
async def hello(request: Request):
    str = "패스트API겁나짜증나"
    arr = ["홍길동", "전우치", "이순신"]
    emps = [ 
        {'e_id' : '1', 'e_name' : '1', 'sex' : '1', 'addr' : '1'},
        {'e_id' : '2', 'e_name' : '2', 'sex' : '2', 'addr' : '2'},
        {'e_id' : '3', 'e_name' : '3', 'sex' : '3', 'addr' : '3'},
    ]
    # print(emps[1]["e_id"])

    return templates.TemplateResponse("index.html", {"request": request, "str": str, "arr": arr, "emps" : emps, 'rows' : rows})
    
conn.close()
curs.close()

# uvicorn myfastapi02:app --reload