def isValidString(s:str)->bool:
    st=[]

    for c in s:
        if c in "{[(":
            st.append(c)
        else:
            if not st:
                return False
            else:
                peek=st[-1]
                if (c=='}' and peek=='{') or \
                   (c==']' and peek=='[') or \
                   (c==')' and peek=='('):
                   st.pop()
                else:
                    return False
    return not st

        



s="{([])}"
result=isValidString(s)
if result:
    print("It is a valid String")
else:
    print("It is not a valid string")