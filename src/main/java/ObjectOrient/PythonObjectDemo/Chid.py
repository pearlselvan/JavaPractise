from Parent import parent
class child:

    def __init__(self,x):
        print "child class constructor with val",x
        self.__x = x

    def get_x(self):
        return self.__x

    def set_x(self, x):
        self.__x = x


    def child_init_method(self):
        print "Child Init Methond"


    def child_teardown_method(self):
        print "Child Cleaning Resources"

if __name__ == '__main__':
    c=child(10)
    c.set_x(200)
    print "Getting the values " ,c.get_x()
    c.child_init_method()
    c.child_teardown_method()
    p=parent()
    p.parent_method_teardown()
    p.parent_method_init()

