def int_to_roman(num):
    roman_map = {
        1000: 'M',
        900: 'CM',
        500: 'D',
        400: 'CD',
        100: 'C',
        90: 'XC',
        50: 'L',
        40: 'XL',
        10: 'X',
        9: 'IX',
        5: 'V',
        4: 'IV',
        1: 'I'
    }
    roman_list = sorted(roman_map.items(), reverse=True)
    roman_num = ''
    for value, roman in roman_list:
        while num >= value:
            roman_num += roman
            num -= value
    return roman_num

num = int(input())
print(int_to_roman(num))