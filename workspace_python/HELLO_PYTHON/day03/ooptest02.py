class Car:
    def __init__(self):
        self.speed = 0
        print("생성자",self.speed)
    def accel(self,strength):
        self.speed += strength
        
    def __del__(self): # 가비지 콜렉션 메모리 처리
        self.speed = 0
        print("소멸",self.speed)

if __name__ == '__main__': # main을 쓰지 않으면 밑에 print도 다른 곳에서 호출하게 되면 다 나온다.
    c = Car()
    print(c.speed)
    c.accel(100)
    print(c.speed)