function getPerfectSquares(numbers) {
    const perfectSquares = [];
        
    for (const number of numbers) {
        if (number >= 0) {
            const root = Math.floor(Math.sqrt(number));
            
            if (root * root === number) {
                perfectSquares.push(number);
            }
        }
            
    }
    
    return perfectSquares;
}

const array = [4, 7, 9, 10, 16, 18];
const newArray = getPerfectSquares(array);

console.log(newArray);
