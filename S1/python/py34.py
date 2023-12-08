def find_longest_word(words_list):
    longest_word = ""
    for word in words_list:
        if len(word) > len(longest_word):longest_word = word
    return len(longest_word)
words_list = raw_input("Enter a list of words separated by spaces: ").split()
longest_word_length=find_longest_word(words_list)
print("Length of the longest word:",longest_word_length)