require('multi')

function calc_squares()
  for i = 1, 100000 do
    print(i * i)
  end
end

function love.load()
  --calc_squares()
  create_thread()
  text = ''
end
function love.draw()
  love.graphics.print('data is :' ..text, 10,10,0,2,2)
end
function love.update()
  local data = love.thread.getChannel('data'):pop()
  if data then 
    text = data
  end
end
function love.keypressed(key)
end