import pymysql
class MemDao:
    def __init__(self):
        self.conn = pymysql.connect(host='localhost',
                       user='root',
                       password='python',
                       port=3305,
                       db='python',
                       charset='utf8')
        self.curs = self.conn.cursor(pymysql.cursors.DictCursor)

    def selects(self):
        sql = "SELECT m_seq,m_name,tel,army_yn FROM member"
        self.curs.execute(sql)
        rows=self.curs.fetchall()
        return rows
    
    def select(self, m_seq):
        sql = f"""
                SELECT 
                    m_seq,
                    m_name,
                    tel,
                    army_yn 
                FROM member 
                WHERE m_seq='{m_seq}'
            """
        self.curs.execute(sql)
        rows=self.curs.fetchall()
        return rows[0]
    def insert(self,m_name,tel,army_yn):
        sql = f"""
                INSERT INTO member
                (m_name,tel,army_yn) 
                VALUES ('{m_name}','{tel}','{army_yn}');
            """
        cnt = self.curs.execute(sql)
        self.conn.commit()
        return cnt
    
    def update(self,m_seq,m_name,tel,army_yn):
        sql = f"""
                UPDATE member 
                SET  m_name='{m_name}',
                     tel= '{tel}',
                     army_yn='{army_yn}'
                WHERE m_seq='{m_seq}'
            """
        cnt = self.curs.execute(sql)
        self.conn.commit()
        return cnt
    
    def __del__(self):
        self.curs.close()
        self.conn.close()
        
    def delete(self,m_seq):
        sql = f"""
                 DELETE FROM MEMBER 
                 WHERE m_seq='{m_seq}'
            """
        cnt = self.curs.execute(sql)
        self.conn.commit()
        return cnt
        
if __name__ == '__main__':
    ed = MemDao();
    rows = ed.selects()
    print(rows)