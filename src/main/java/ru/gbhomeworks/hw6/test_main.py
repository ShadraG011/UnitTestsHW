import pytest
from main import *


def test_avg():
    assert avg([1, 2, 3, 4, 5]) == 3

def test_avg_list_exception():
    with pytest.raises(TypeError):
        which_avg_list_is_more(8, "h")

def test_first_avg_list_is_more():
    arr1 = [1, 2, 3, 4, 5]
    arr2 = [1, 1, 3, 4, 1]

    assert which_avg_list_is_more(arr1, arr2) == "Первый список имеет большее среднее значение"

def test_second_avg_list_is_more():
    arr1 = [1, 23, 3, 4, 1, 15, 16]
    arr2 = [10, 88, 332, 4, 500, 1,]

    assert which_avg_list_is_more(arr1, arr2) == "Второй список имеет большее среднее значение"

def test_all_avg_list_is_equal():
    arr1 = [1, 23, 3, 4, 1, 15, 16]
    arr2 = [1, 23, 3, 4, 1, 15, 16]
    
    assert which_avg_list_is_more(arr1, arr2) == "Средние значения равны"