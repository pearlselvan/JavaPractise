class parent:
    def parent_method_init(self):
        print "Parent Init Method"

    def parent_method_teardown(self):
        print "Parent Cleaning Resouces"


if __name__ == '__main__':
     p = parent()
     p.parent_method_init()
     p.parent_method_teardown()
