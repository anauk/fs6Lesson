/*
Create a function truncate(str, maxlength) that checks the length of the str and, if it  exceeds maxlength – replaces the end of str with the ellipsis character "…", to make  its length equal to maxlength
The result of the function should be the truncated (if needed) string
For instance:

alert(truncate("What I'd like to tell on this topic is:", 20)); // "What I'd like to te…"
alert(truncate("Hi everyone!", 20)); // "Hi everyone!"*/


/*function truncate(str, maxlength){
    let lengthStr = str.length;  
    
    if(maxlength>lengthStr){
        return str;
    }else{
        let subStr = str.substr(0,maxlength-1);
        return subStr+'...';
    }
}*/

/*function truncate(str, maxlength){   
    if(maxlength>str.length){
        return str;
    }else{
        return str.substr(0,maxlength-1) +'...';        
    }
}*/

function truncate(str, maxlength){   
    return (maxlength>str.length)?str : str.substr(0,maxlength-1) +'...';         
}

console.log(truncate("What I'd like to tell on this topic is:", 20));
console.log(truncate("Hi everyone!", 20)); 