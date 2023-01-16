import pymysql

conn = pymysql.connect(host='localhost',
                       user='root',
                       password='python',
                       port=3305,
                       db='python',
                       charset='utf8')
curs = conn.cursor()

sql = "SELECT * FROM emp "
curs.execute(sql)
rows =curs.fetchall()

print(rows)
print(curs.rowcount)
curs.close()
conn.close()



# with conn:
#     with conn.cursor(pymysql.cursors.DictCursor) as cur:
#         cur.execute(sql)
#         result = cur.fetchall()
#         for data in result:
#             print(data)
# print("cnt",cur.rowcount)
