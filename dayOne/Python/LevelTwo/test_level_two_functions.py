from unittest import TestCase
import level_two_functions

class test_level_two_functions(TestCase): 
    
    def test_perfect_squared_numbers(self):
        numbers = [1, 2, 3, 2, 4, 3];
        
        actual = level_two_functions.get_repeated_values(numbers);
        
        expected = [2, 3];
		
        self.assertEqual(expected, actual)
