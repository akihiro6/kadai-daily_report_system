package models.validators;

import java.util.ArrayList;
import java.util.List;

import models.Report;

public class ReportValidator {
    public static List<String> validate(Report r) {
        List<String> errors = new ArrayList<String>();

        String title_error = _validateTitle(r.getTitle());
        if(!title_error.equals("")) {
            errors.add(title_error);
        }

        String content_error = _validateContent(r.getContent());
        if(!content_error.equals("")) {
            errors.add(content_error);
        }

        String commuting_time_error =_validateCommuting_time(r.getCommuting_time());
        if(!commuting_time_error.equals("")) {
            errors.add(commuting_time_error);
        }

        String attendance_time_error =_validateAttendance_time(r.getAttendance_time());
        if(!attendance_time_error.equals("")) {
            errors.add(attendance_time_error);
        }

        return errors;
    }

    private static String _validateTitle(String title) {
        if(title == null || title.equals("")) {
            return "タイトルを入力してください。";
        }
        return "";
    }

    private static String _validateContent(String content) {
        if(content == null || content.equals("")) {
            return "内容を入力してください。";
        }
        return "";
    }

    private static String _validateCommuting_time(String commuting_time) {
        if(commuting_time == null || commuting_time.equals("")) {
            return "出勤時間を入力してください。";
        }
        return "";
    }

    private static String _validateAttendance_time(String attendance_time) {
        if(attendance_time == null || attendance_time.equals("")) {
            return "退勤時間を入力してください。";
        }
        return "";
    }
}

