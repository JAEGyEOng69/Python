import pymysql

conn = pymysql.connect(host='localhost',
                       user='root',
                       password='python',
                       port=3305,
                       db='python',
                       charset='utf8')

sql = "INSERT INTO emp(e_id,e_name,sex,addr) VALUES (%s,%s,%s,%s);"


with conn:
    with conn.cursor() as cur:
        cur.execute(sql, ('3', '3','3','3'))
        print("cnt",cur.rowcount)
        conn.commit()