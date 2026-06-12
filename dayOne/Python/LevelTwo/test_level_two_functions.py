from unittest import TestCase
import level_two_functions

class test_level_two_functions(TestCase): 
    
    def test_perfect_squared_numbers(self):
        numbers = [1, 2, 3, 2, 4, 3];
        
        actual = level_two_functions.get_repeated_values(numbers);
        
        expected = [2, 3];
		
        self.assertEqual(expected, actual)
        
        
    def test_that_zeroes_are_moved_to_the_back(self):
        numbers = [5, 0, 3, 0, 2, 0];
        
        actual = level_two_functions.move_all_zeroes(numbers);
        
        expected = [5, 3, 2, 0, 0, 0];
		
        self.assertEqual(expected, actual)
