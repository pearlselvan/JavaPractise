# O(n) time and O(1)O(1) space. We only loop through the array once.
def getProfit(stockPrices):
    minPrice=stackPrices[0]
    maxprofit=stackPrices[1]-stackPrices[0]
    for cp in range(len(stackPrices)):
        minPrice=min(stackPrices[cp],minPrice)
        potentialprofit=stackPrices[cp]-minPrice
        maxprofit=max(potentialprofit,maxprofit)
    return maxprofit




stackPrices=[5, 3, 1, 8]
if __name__ == '__main__':
    print "MAX - " ,getProfit(stackPrices)

