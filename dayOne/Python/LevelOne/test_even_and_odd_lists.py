from unittest import TestCase
import even_and_odd_lists

class test_even_and_odd_lists(TestCase):
    
    def test_that_even_and_odd_lists_are_correct(self):
        numbers = [45, 60, 3, 10, 9, 22]
        actual = even_and_odd_lists.split_list(numbers)
        expected = [[60, 10, 22], [45, 3, 9]];
        self.assertEqual(expected, actual)
