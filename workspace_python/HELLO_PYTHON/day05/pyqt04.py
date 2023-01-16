import sys
from PyQt5.QtWidgets import *
from PyQt5 import uic
from asn1crypto.core import Integer
from spyder.plugins.console.widgets.internalshell import SysOutput
from day02.mydef04 import getLotto, arr6
from random import random

form_class = uic.loadUiType("pyqt04.ui")[0]

class MyWindow(QMainWindow, form_class):
    def __init__(self):
        super().__init__()
        self.setupUi(self)
        self.pb.clicked.connect(self.myclick)
         
        
    def myclick(self):
        self.pb.clicked.connect(self.lotto)
        
    def lotto(self):
        arr6= [1,2,3,4,5  ,6,7,8,9,10,  11,12,13,14,15,16,17, 18,19,20,21,
               22,23,24,25, 26,27,28,29, 30,31,32,33,34, 35,36,37,38,39,40, 41,42,43,44,45]
    
        for i in range(100):
            rnd = int(random() * len(arr6))
            a= arr6[0]
            b= arr6[rnd]
            arr6[0]=b
            arr6[rnd]=a
        self.le1.setText(str(arr6[0]))
        self.le2.setText(str(arr6[1]))
        self.le3.setText(str(arr6[2]))
        self.le4.setText(str(arr6[3]))
        self.le5.setText(str(arr6[4]))
        self.le6.setText(str(arr6[5]))
if __name__ == "__main__":
    app = QApplication(sys.argv)
    myWindow = MyWindow()
    myWindow.show()
    app.exec_()