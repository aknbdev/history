from turtle import Turtle, Screen
# satr = input("Enter the word: ")
# for s in satr:
#     if s.isdigit():
#         continue
#         # print("Sinish jarayoni: " , s)
#         # break
#     print(s)

oyna = Screen()
oyna.title("My Screen.")

chiziq = Turtle()
chiziq.color("blue")
chiziq.pensize(5)
chiziq.speed(0)
chiziq.hideturtle()
chiziq.up()
chiziq.goto(200, 200)
chiziq.down()
chiziq.goto(200, -200)
chiziq.goto(-200, -200)
chiziq.goto(-200, 200)
chiziq.goto(200, 200)

koptok = Turtle()
koptok.pensize(3)
koptok.shape("circle")
koptok.color("red")
koptok.up()
koptok.goto(0, 0)

stop = Turtle()
stop.color("black")
stop.pensize(5)
stop.hideturtle()
stop.speed(0)
stop.up()
stop.goto(-30, -160)
stop.down()
stop.goto(-30, -200)
stop.goto(-160, -200)
stop.goto(-160, -160)
stop.goto(-30, -160)
step_x = 3
step_y = 2

while True:
    x, y = koptok.position()
    if x + step_x >= 200 or x+step_x <= -200:
        step_x = -step_x
    if y + step_y >= 200 or y+step_y <= -200:
        step_y = -step_y
    if x+step_x <= -35 and x+step_x >= -155 and y+step_y <= -165 and y+step_y >= -200:
        break

    koptok.goto(x + step_x, y+step_y)

oyna.mainloop()
