SELECT
    user_id
    , name
FROM
    cfca_user
WHERE
    1=1
  AND user_id = /* id */1
  AND deleted_at IS NULL