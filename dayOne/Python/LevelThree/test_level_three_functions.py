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
        
        
#    def test_that_zeroes_are_moved_to_the_back(self):
#        numbers = [5, 0, 3, 0, 2, 0];
#        
#        actual = level_two_functions.move_all_zeroes(numbers);
#        
#        expected = [5, 3, 2, 0, 0, 0];
#		
#        self.assertEqual(expected, actual)
