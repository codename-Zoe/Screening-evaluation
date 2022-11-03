const transformValue = obj => {
  for (const key in obj) {
    if(typeof obj[key] === 'object'){
      for(let elem in obj[key]){
        if(typeof obj[key][elem] === 'object'){
          for(let e in obj[key][elem]){
            checkType(e);
          }
        }else{
          checkType(elem);
        }        
      }
    } else{
      checkType(obj[key]);
    }
  }
  return obj;
};

const checkType = elem => {
  if(typeof elem === 'number'){
    elem++;
  } else if(typeof obj === 'string'){
    elem = elem + ' AI';
  }
}

const obj = {
  a: 123,
  b: 'hero',
  c: [1, 2, 3],
  d: {
    e: 3,
    f: ['abc', 'def']
  }
}
console.log(transformValue(obj));