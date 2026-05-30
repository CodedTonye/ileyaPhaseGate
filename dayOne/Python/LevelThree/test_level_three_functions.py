from unittest import TestCase
import level_three_functions

class test_level_three_functions(TestCase): 
    
    def test_that_2D_list_is_flattened_correctly(self):
        numbers = [
		    [9, 0, 7],
		    [3, 5, 1],
		    [8, 1, 7],
		    [9, 9, 6]
		]
        
        actual = level_three_functions.flatten_list(numbers);
        
        expected = [9, 0, 7, 3, 5, 1, 8, 1, 7, 9, 9, 6];
		
        self.assertEqual(expected, actual)
        
        
        
    def test_that_rotation_of_list_by_given_position_is_correct(self):
        numbers = [1, -9, 3, 0, 8]
        
        k = 2;
        
        actual = level_three_functions.rotate_list(numbers, k);
        
        expected = [0, 8, 1, -9, 3];
		
        self.assertEqual(expected, actual)   

