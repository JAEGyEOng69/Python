import pymysql
class EmpDao:
    def __init__(self):
        self.conn = pymysql.connect(host='localhost',
                       user='root',
                       password='python',
                       port=3305,
                       db='python',
                       charset='utf8')
        self.curs = self.conn.cursor(pymysql.cursors.DictCursor)

    def selects(self):
        sql = "SELECT e_id,e_name,sex,addr FROM emp"
        self.curs.execute(sql)
        rows=self.curs.fetchall()
        return rows
    
    def select(self, e_id):
        sql = f"""
                SELECT 
                    e_id,
                    e_name,
                    sex,
                    addr 
                FROM emp 
                WHERE e_id='{e_id}'
            """
        self.curs.execute(sql)
        rows=self.curs.fetchall()
        return rows[0]
    def insert(self,e_id,e_name,sex,addr):
        sql = f"""
                INSERT INTO emp
                (e_id,e_name,sex,addr) 
                VALUES ('{e_id}','{e_name}','{sex}','{addr}');
            """
        cnt = self.curs.execute(sql)
        self.conn.commit()
        return cnt
    
    def update(self,e_name,sex,addr,e_id):
        sql = f"""
                UPDATE emp 
                SET  e_name='{e_name}',
                     sex= '{sex}',
                     addr='{addr}'
                WHERE e_id='{e_id}'
            """
        cnt = self.curs.execute(sql)
        self.conn.commit()
        return cnt
    
    def __del__(self):
        self.curs.close()
        self.conn.close()
        
    def delete(self,e_id):
        sql = f"""
                 DELETE FROM emp 
                 WHERE e_id='{e_id}'
            """
        cnt = self.curs.execute(sql)
        self.conn.commit()
        return cnt
        
if __name__ == '__main__':
    ed = EmpDao()
    rows = ed.selects()
    print(rows)