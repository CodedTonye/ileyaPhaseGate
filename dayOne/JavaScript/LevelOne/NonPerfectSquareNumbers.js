function replaceNonPerfectSquares(numbers) {
    const result = [];
        
    for (const number of numbers) {
        const sqrt = Math.floor(Math.sqrt(number));
            
        if (sqrt * sqrt === number) {
            result.push(number);
        } else {
            result.push(-1)
        }
    }
            
    
    return result;
}

const array = [4, 7, 9, 10, 49, 6];
const newArray = replaceNonPerfectSquares(array);

console.log(newArray);
