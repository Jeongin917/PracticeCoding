-- 코드를 작성해주세요
select ID, EMAIL, FIRST_NAME, LAST_NAME
from DEVELOPER_INFOS
where 'Python' in (SKILL_1, SKILL_2, SKILL_3)
-- where in 함수를 사용하여 작성
order by ID;