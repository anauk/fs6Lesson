//Create a function countWords(sentence) that gets a sentence and prints to the  console the number of occurrences of each word in the sentence
//For instance:




function countWords(sentence) {
let arr = sentence.split(' ');
    let arrSet = new Set(arr);
    let map = new Map();
    for(let key of arrSet){
        let sum =0;
        for(let i =0; i < arr.length; i++){
            if(arr[i] == key){
                sum++;
            }
        }
        map.set(key, sum);
    }
    console.log(map);
    return map;
}

let sentence = "John the second is the son of John the first,  while the second son of John the second is William the  second.";
countWords(sentence);