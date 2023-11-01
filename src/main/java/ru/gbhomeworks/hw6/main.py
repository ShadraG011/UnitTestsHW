def avg( array):
    return sum(array) / len(array)


def which_avg_list_is_more(array, array2):

    if not isinstance(array, list) or not isinstance(array2, list):
        raise TypeError("Переданное значение не является массивом(списком)!")

    avg1 = avg(array)
    avg2 = avg(array2)

    if (avg1 > avg2):
        return "Первый список имеет большее среднее значение"
    elif (avg1 < avg2):
        return "Второй список имеет большее среднее значение"
    else:
        return "Средние значения равны"
