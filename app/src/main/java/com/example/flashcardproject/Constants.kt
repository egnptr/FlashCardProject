package com.example.flashcardproject

object Constants {

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

        val q4 = Question(3, "Find the value of x; if x = (2 × 3) + 11.",
            "55", "192", "17", "66", 3)

        questionList.add(q4)

        val q5 = Question(3, "Find the value of x; if x = (2 × 3) + 11.",
            "55", "192", "17", "66", 3)

        questionList.add(q5)

        val q6 = Question(3, "Find the value of x; if x = (2 × 3) + 11.",
            "55", "192", "17", "66", 3)

        questionList.add(q6)

        val q7 = Question(3, "Find the value of x; if x = (2 × 3) + 11.",
            "55", "192", "17", "66", 3)

        questionList.add(q7)

        val q8 = Question(3, "Find the value of x; if x = (2 × 3) + 11.",
            "55", "192", "17", "66", 3)

        questionList.add(q8)

        val q9 = Question(3, "Find the value of x; if x = (2 × 3) + 11.",
            "55", "192", "17", "66", 3)

        questionList.add(q9)

        val q10 = Question(3, "Find the value of x; if x = (2 × 3) + 11.",
            "55", "192", "17", "66", 3)

        questionList.add(q10)

        return questionList
    }
}