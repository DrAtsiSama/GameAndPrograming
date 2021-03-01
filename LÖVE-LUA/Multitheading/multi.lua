local threaCode = [[
  local soc = require('socket')
  local start, ending = ...

  for i = start, ending do
    love.thread.getChannel('data'):push(i * i)
    soc.sleep(0.2)
  end

]]

function create_thread()
  local thread = love.thread.newThread(threaCode)
  -- local thread = love.thread.newThread('multi2.lua')
  thread:start(1, 100000)
end