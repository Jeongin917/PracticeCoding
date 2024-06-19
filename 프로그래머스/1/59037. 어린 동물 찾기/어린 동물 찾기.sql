-- 코드를 입력하세요
SELECT ANIMAL_ID, NAME
from ANIMAL_INS 
-- where not INTAKE_CONDITION in('Aged')
where intake_condition != 'Aged'
order by ANIMAL_ID;

-- not 연산자 사용 시 'not 조건절 in (조건)'
-- not 연산자를 사용하지 않고 != 등과 같은 조건연산자 사용 가능