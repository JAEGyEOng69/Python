import sys
from PyQt5.QtWidgets import *
from PyQt5 import uic
from asn1crypto.core import Integer
from spyder.plugins.console.widgets.internalshell import SysOutput
from random import random

form_class = uic.loadUiType("pyqt07.ui")[0]

class MyWindow(QMainWindow, form_class):
    def __init__(self):
        super().__init__()
        self.setupUi(self)
        self.pb.clicked.connect(self.myclick)
        self.le_Mine.returnPressed.connect(self.myclick)
        
        
    def myclick(self):
        user = self.le_Mine.text()
        com = "";
        result="";
        rnd = random()
        if rnd>0.66:
            com="가위"   
        elif rnd<0.33:
            com="주먹"
        else :
            com = "바위"   
            
        if user=="가위" and com=="보" or user=="주먹" and com=="가위" or user=="보" and com=="주먹":
            result = "승리"   
        elif user==com :
            result = "비김"
        else :
            result="패배"
    
        self.le_Com.setText(com)
        self.le_Result.setText(result)
        
if __name__ == "__main__":
    app = QApplication(sys.argv)
    myWindow = MyWindow()
    myWindow.show()
    app.exec_()
    