import unittest
from code_wars import merge_arrays


class TestMergeArrays(unittest.TestCase):
    def basic_tests(self):
        self.assertEqual(merge_arrays([1, 2, 3, 4], [5, 6, 7, 8]), [1, 2, 3, 4, 5, 6, 7, 8])


if __name__ == '__main__':
    unittest.main()
