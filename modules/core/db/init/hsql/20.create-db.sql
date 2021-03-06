-- begin CLASS1_CITIZEN
create unique index IDX_CLASS1_CITIZEN_UNIQ_ID_NUMBER on CLASS1_CITIZEN (ID_NUMBER) ^
-- end CLASS1_CITIZEN
-- begin CLASS1_BUSINESS
alter table CLASS1_BUSINESS add constraint FK_CLASS1_BUSINESS_CONTACT_PERSON foreign key (CONTACT_PERSON_ID) references CLASS1_CITIZEN(ID)^
create unique index IDX_CLASS1_BUSINESS_UNIQ_BUSINESS_REGISTRATION_NUMBER on CLASS1_BUSINESS (BUSINESS_REGISTRATION_NUMBER) ^
create index IDX_CLASS1_BUSINESS_CONTACT_PERSON on CLASS1_BUSINESS (CONTACT_PERSON_ID)^
-- end CLASS1_BUSINESS
-- begin CLASS1_ACTIVITY_CODES
create unique index IDX_CLASS1_ACTIVITY_CODES_UNIQ_ACTIVITY_CODE on CLASS1_ACTIVITY_CODES (ACTIVITY_CODE) ^
-- end CLASS1_ACTIVITY_CODES
