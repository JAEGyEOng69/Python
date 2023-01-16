import pymysql

conn = pymysql.connect(host='localhost',
                       user='root',
                       password='python',
                       port=3305,
                       db='python',
                       charset='utf8'
                       )

curs = conn.cursor()
e_id ="4"
sql = f""" 
        DELETE FROM emp 
        WHERE e_id='{e_id}'
        
      """
cnt = curs.execute(sql)
print("cnt",cnt)
print(sql)
conn.commit()
curs.close()
conn.close()