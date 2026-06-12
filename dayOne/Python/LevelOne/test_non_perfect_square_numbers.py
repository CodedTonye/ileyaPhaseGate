from unittest import TestCase
import non_perfect_square_numbers

class test_non_perfect_square_numbers(TestCase):
    
    def test_perfect_squared_numbers(self):
        numbers = [4, 7, 9, 10, 49, 6]
        
        actual = non_perfect_square_numbers.replace_non_perfect_square_numbers(numbers)
        
        expected = [4, -1, 9, -1, 49, -1]
		
        self.assertEqual(expected, actual)
