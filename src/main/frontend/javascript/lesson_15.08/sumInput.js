function sumInput(){
    let res = 0;
    
    
    return res;
}

function getUsrPrompt(invitation){
    let nums = [];
    
    while (newNum = prompt(invitation) != null){
        if (newNum = Number(newNum)){
            nums.push(newNum);    
        }   
    }
    
    return nums.reduce((el1, el2) => el1 + el2);
           
    
}
