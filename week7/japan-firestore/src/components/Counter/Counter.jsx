import React from 'react'

const Counter = ({value, onChange}) => {
  return (
    <div>
      <button onClick={() => onChange(value - 1)}></button>
      <button onClick={() => onChange(value + 1)}></button>
    </div>
  )
}

export default Counter
