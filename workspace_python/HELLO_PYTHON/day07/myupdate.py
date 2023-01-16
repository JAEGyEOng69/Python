import pymysql
e_id="4"
e_name ="7"
sex="7"
addr="7"
conn = pymysql.connect(host='localhost',
                       user='root',
                       password='python',
                       port=3305,
                       db='python',
                       charset='utf8')
curs = conn.cursor()
sql = f"""UPDATE emp 
         SET e_name='{e_name}', 
             sex='{sex}', 
             addr='{addr}' 
         WHERE e_id = '{e_id}'
    """
cnt = curs.execute(sql)
print("cnt",cnt)
print(sql)
conn.commit()
curs.close()
conn.close()