import sys
from PyQt5.QtWidgets import *
from PyQt5 import uic
from asn1crypto.core import Integer
from spyder.plugins.console.widgets.internalshell import SysOutput
from bleach._vendor.html5lib.treebuilders.etree_lxml import tostring

form_class = uic.loadUiType("pyqt06.ui")[0]

class MyWindow(QMainWindow, form_class):
    def __init__(self):
        super().__init__()
        self.setupUi(self)
        self.pb.clicked.connect(self.myclick)
         
        
    def myclick(self):
        self.pb.clicked.connect(self.gudan)
        
    def gudan(self):
        idan = int(self.le.text())
        dan = ""
        # for i in range(1,10):
        #     dan += "{} X {} = {} \n".format(str(idan), str(i), str(idan*i))
        #     print(dan)
            
        dan += f"{idan} * {1} = {idan * 1}\n"
        dan += f"{idan} * {2} = {idan * 2}\n"
        dan += f"{idan} * {3} = {idan * 3}\n"
        dan += f"{idan} * {4} = {idan * 4}\n"
        dan += f"{idan} * {5} = {idan * 5}\n"
        dan += f"{idan} * {6} = {idan * 6}\n"
        dan += f"{idan} * {7} = {idan * 7}\n"
        dan += f"{idan} * {8} = {idan * 8}\n"
        dan += f"{idan} * {8} = {idan * 9}\n"
        
        self.te.setText(dan)
        
        # self.te.setText(dan)
if __name__ == "__main__":
    app = QApplication(sys.argv)
    myWindow = MyWindow()
    myWindow.show()
    app.exec_()