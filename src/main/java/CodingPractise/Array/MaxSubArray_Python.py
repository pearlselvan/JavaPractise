def max_sum(list):
    max_so_far=0 # return this
    max_end=0

    for index in range(len(list)):
        max_end=max_end+list[index]
        if(max_so_far < max_end):
            max_so_far=max_end
        if(max_end<0):
            max_end=0
    print max_so_far

if __name__ == '__main__':
    max_sum([-7, -3, 5, 8, 2, 4])
