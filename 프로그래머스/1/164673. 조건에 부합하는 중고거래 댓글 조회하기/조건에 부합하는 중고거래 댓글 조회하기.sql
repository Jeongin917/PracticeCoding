-- 코드를 입력하세요
SELECT b.TITLE
, b.BOARD_ID
, r.REPLY_ID
, r.WRITER_ID
, r.CONTENTS
, date_format(r.CREATED_DATE, '%Y-%m-%d') CREATED_DATE
from USED_GOODS_BOARD b, USED_GOODS_REPLY r
where 1=1
and b.BOARD_ID = r.BOARD_ID
and b.CREATED_DATE like '2022-10%'
order by r.CREATED_DATE asc, b.title asc