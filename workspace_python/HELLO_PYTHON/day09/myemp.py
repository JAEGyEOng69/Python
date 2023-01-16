from fastapi import FastAPI, File, Form, UploadFile, Request
from fastapi.responses import HTMLResponse
from fastapi.staticfiles import StaticFiles 
from fastapi.templating import Jinja2Templates 
from anaconda_navigator.utils.py3compat import request
import pymysql
from day09 import emp_dao


app = FastAPI() 

app.mount("/static", StaticFiles(directory="static"), name="static") 
templates = Jinja2Templates(directory="templates") 

@app.get("/emp_list", response_class=HTMLResponse)
async def emp_list(request : Request):
   ed = emp_dao()
   ed.se
  
    return templates.TemplateResponse("emp_list.html",{"request": request})
#uvicorn main:app --reload