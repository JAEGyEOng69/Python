import sys
from PyQt5.QtWidgets import *
from PyQt5 import uic
from asn1crypto.core import Integer
from spyder.plugins.console.widgets.internalshell import SysOutput
from random import random

form_class = uic.loadUiType("pyqt05.ui")[0]

class MyWindow(QMainWindow, form_class):
    def __init__(self):
        super().__init__()
        self.setupUi(self)
        self.pb.clicked.connect(self.myclick)
        self.leMine.returnPressed.connect(self.game)
        
    def myclick(self):
        self.pb.clicked.connect(self.game)
        
    def game(self):
        user = self.leMine.text()
        com = "";
        result="";
        rnd = random()
        if rnd>0.5:
            com="홀"   
        else:
            com="짝"
        if user == com :
            result = "승리"   
        else :
            result = "패배"
        self.leCom.setText(com)
        self.leResult.setText(result)
        
if __name__ == "__main__":
    app = QApplication(sys.argv)
    myWindow = MyWindow()
    myWindow.show()
    app.exec_()
    