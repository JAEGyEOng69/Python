class Biden:
    def __init__(self):
        self.ac = 10
    def makewar(self):
        self.ac -= 1

class Putin:
    def __init__(self):
        self.nuclear =6660
        
    def altzheimer(self):
        self.nuclear -= 1

class Mugun(Biden,Putin):
    def __init__(self):
        Biden.__init__(self)
        Putin.__init__(self)
            
    
if __name__ == '__main__':        
    mg= Mugun()
    print(mg.ac)
    print(mg.nuclear)
    mg.makewar()
    mg.altzheimer()
    print(mg.ac)
    print(mg.nuclear)
    
        