# 내가한거
class Animal:

     def __init__(self):
        self.hungry = 5

     def timegoby(self):
         if self.hungry > 0:
            self.hungry -= 1

     def mattang(self):
        self.hungry = 10


class Human(Animal):

    def __init__(self):
        super().__init__() #extends 할 때 super를 꼭 사용해야한다.
        self.skill_lang = 0

    def momstouch(self, stroke):
        self.skill_lang += stroke


hum = Human();
print(hum.hungry)
print(hum.skill_lang)
hum.timegoby()
hum.momstouch(5)
print(hum.hungry)
print(hum.skill_lang)

# class Animal:
#     def __init__(self):
#         self.hungry =5 
#     def timegoby(self):
#         if self.hungry >0:
#             self.hungry -= 1
#     def mattang(self):
#         self.hungry = 10
#
# ani = Animal()
#
# print(ani.hungry)
# ani.timegoby()
# ani.mattang()
# print(ani.hungry) 
