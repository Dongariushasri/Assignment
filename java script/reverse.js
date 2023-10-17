function reverseWords(sentence) {
    // Split the sentence into an array of words
    let words = sentence.split(' ');

    // Reverse each word in the array
    let reversedWords = words.map(word => reverseString(word));

    // Join the reversed words back into a sentence
    let reversedSentence = reversedWords.join(' ');

    return reversedSentence;
}

function reverseString(str) {
    // Split the string into an array of characters, reverse it, and join back into a string
    return str.split('').reverse().join('');
}

// Example usage
let inputSentence = "Every word in this sentence will be reversed";
let result = reverseWords(inputSentence);

console.log(result);