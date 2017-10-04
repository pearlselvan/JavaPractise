#http://abregman.com/2016/11/29/python-objects-comparison/
class Ball(object):

    def __init__(self, color, size):
        self.color = color
        self.size = size

    def __eq__(self, other):
        """Override the default Equals behavior"""
        print "EQ" , self.color , other.color
        print "EQ" , self.size , other.size
        return self.color == other.color and self.size == other.size

    def __ne__(self, other):
        print "NE" , self.color , other.color
        print "NE" , self.size , other.size
        """Override the default Unequal behavior"""
        return self.color != other.color or self.size != other.size

ball1 = Ball('blue', 'small')
ball2 = Ball('blue', 'small')
ball3 = Ball('green', 'small')

print(ball1 == ball2) # Prints True :)
print(ball1 == ball3) # Prints False :)
