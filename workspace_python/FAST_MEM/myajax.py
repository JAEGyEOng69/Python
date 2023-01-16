from fastapi import FastAPI, File, Form, UploadFile, Request
from fastapi.responses import HTMLResponse
from fastapi.staticfiles import StaticFiles 
from fastapi.templating import Jinja2Templates 
import pymysql
from starlette.responses import JSONResponse
from member_dao import MemDao
from pydantic import BaseModel

class Member(BaseModel):
    m_seq: str = None
    m_name: str =None
    tel: str =None
    army_yn: str = None



app = FastAPI() 

app.mount("/static", StaticFiles(directory="static"), name="static") 
templates = Jinja2Templates(directory="templates") 

@app.get("/member", response_class=HTMLResponse)
async def member_list(request : Request):
    return templates.TemplateResponse("member.html",{"request": request})

@app.get("/member_selects")
async def member_selects():
    ed = MemDao()
    mems = ed.selects()
    return JSONResponse(mems)

@app.post("/member_select")
async def member_select(mem:Member):
    print(mem.m_seq)
    ed = MemDao()
    mem = ed.select(mem.m_seq)
    return JSONResponse(mem)

@app.post("/member_insert")
async def member_insert(mem:Member):
    ed = MemDao()
    cnt = ed.insert(mem.m_name, mem.tel, mem.army_yn)
    return JSONResponse(cnt)

@app.post("/member_delete")
async def member_delete(mem:Member):
    ed = MemDao()
    cnt = ed.delete(mem.m_seq);
    return JSONResponse(cnt)

@app.post("/member_update")
async def member_update(mem:Member):
    ed = MemDao()
    cnt = ed.update(mem.m_seq,mem.m_name, mem.tel, mem.army_yn);
    return JSONResponse(cnt)
#uvicorn myajax:app --reload
