from Parent import parent
class child:
    def child_init_method(self):
        print "Child Init Methond"


    def child_teardown_method(self):
        print "Child Cleaning Resources"

if __name__ == '__main__':
    c=child()
    c.child_init_method()
    c.child_teardown_method()
    p=parent()
    p.parent_method_teardown()
    p.parent_method_init()

