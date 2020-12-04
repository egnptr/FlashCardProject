package com.example.flashcardproject

object Constants {

    const val USER_NAME: String = "user_name"
    const val TOTAL_QUESTION: String = "total_question"
    const val CORRECT_ANSWERS: String = "correct_answers"

    fun getQuestions(): ArrayList<Question>{
        val questionList = ArrayList<Question>()

        val q1 = Question(1, "How much is 190 – 87 + 16?",
            "103", "261", "87", "119", 4)

        questionList.add(q1)

        val q2 = Question(2, "Arrange the numbers in ascending order: 36, 12, 29, 21, 7.",
            "36, 29, 21, 12, 7", "36, 29, 7, 21, 12", "7, 12, 21, 29, 36", "None of the above", 3)

        questionList.add(q2)

        val q3 = Question(3, "Find the value of x; if x = (2 × 3) + 11.",
            "55", "192", "17", "66", 3)

        questionList.add(q3)

        val q4 = Question(4, "Solve: 24 + 4 / 5.",
            "25", "6", "28", "7", 1)

        questionList.add(q4)

        val q5 = Question(5, "Simplify : 3 + 6 x (5 + 4) ÷ 3 - 7.",
            "11", "16", "14", "15", 3)

        questionList.add(q5)

        val q6 = Question(6, "What is 1004 divided by 2?",
            "52", "502", "520", "5002", 2)

        questionList.add(q6)

        val q7 = Question(7, "What is the average value of 25, 20, 23 and 22?",
            "20", "21.5", "22.5", "24", 3)

        questionList.add(q7)

        val q8 = Question(8, "How many hours in 90 minutes?",
            "1.5 h", "1.30 h", "1 hour", "None of these", 2)

        questionList.add(q8)

        val q9 = Question(9, "Complete the sequence 13, 16, ……, 22.",
            "17", "18", "19", "20", 3)

        questionList.add(q9)

        val q10 = Question(10, "Evaluation of 83 × 82 × 8-5 is?",
            "1", "0", "8", "None of these", 4)

        questionList.add(q10)

        val q11 = Question(11, "How many lines can be drawn through two points?",
            "1", "2", "3", "Not possible", 1)

        questionList.add(q11)

        val q12 = Question(12, "106 × 106 – 94 × 94 = ?",
            "2004", "2400", "1904", "1906", 2)

        questionList.add(q12)

        val q13 = Question(13, "Factors of 9 are…..",
            "1, 2 and 3", "1, 2, 3 and 9", "1, 6 and 9", "None of these", 3)

        questionList.add(q13)

        val q14 = Question(14, "1010 gram = ……… kg.",
            "10.10 kg", "101.0 kg", "1.001 kg", "1.01 kg", 4)

        questionList.add(q14)

        val q15 = Question(15, "Which of these following set of numbers are factors of 24?",
            "2, 3, 4, 6, 8", "1, 5, 12, 18", "4, 7, 24", "3, 9, 12", 1)

        questionList.add(q15)

        val q16 = Question(16, "If David’s age is 27 years old in 2011. What was his age in 2003?",
            "17", "37", "20", "19", 4)

        questionList.add(q16)

        val q17 = Question(17, "Average of three person’s age is 9 years. Find the sum of their age.",
            "18", "21", "24", "27", 4)

        questionList.add(q17)

        val q18 = Question(18, "3456 ÷ 12 ÷ 8 = ?",
            "33.5", "36.5", "36", "33", 3)

        questionList.add(q18)

        val q19 = Question(19, "The cube root of 1331 is ………… .",
            "11", "13", "19", "17", 1)

        questionList.add(q19)

        val q20 = Question(20, "10003 – 999 = ………….. .",
            "4009", "9004", "9040", "9400", 3)

        questionList.add(q20)

        return questionList
    }
}