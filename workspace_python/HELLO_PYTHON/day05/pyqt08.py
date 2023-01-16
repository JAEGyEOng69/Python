import sys
from PyQt5.QtWidgets import *
from PyQt5 import uic
from asn1crypto.core import Integer
from spyder.plugins.console.widgets.internalshell import SysOutput
from random import random

form_class = uic.loadUiType("pyqt08.ui")[0]

class MyWindow(QMainWindow, form_class):
    def __init__(self):
        super().__init__()
        self.setupUi(self)
        self.pb.clicked.connect(self.myclick)
        self.le_last.returnPressed.connect(self.myclick)
        
        
    def myclick(self):
        a = self.le_first.text()
        b = self.le_last.text()
        
        aa = int(a)
        bb = int(b)
        
        txt = ""
        for i in range(aa,bb+1):
            txt += self.drawStar(i)
    
        self.te.setText(txt)
        
    def drawStar(self, param):
        ret=""
        for i in range(param):
            ret += "*"
        ret += "\n"
        return ret
    
if __name__ == "__main__":
    app = QApplication(sys.argv)
    myWindow = MyWindow()
    myWindow.show()
    app.exec_()
    