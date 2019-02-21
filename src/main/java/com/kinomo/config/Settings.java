package com.kinomo.config;

public class Settings {
    public static final String BASE_URL = "https://stage-platform.kino-mo.com/api/v1/cct-projects";
    public static final String KM_AUTH = "km-auth";
    public static final String SESSION_TOKEN = "3f172abe9227004a68091ac7f78aec7b2433f27a46be60ad720042486e213d055bd6f9779701d962b6808780";

    public static final String NewProjectJson = "{\\n\" +\n" +
            "                        \"    \\\"scheme\\\": 0,\\n\" +\n" +
            "                        \"    \\\"projectName\\\": \\\"01NProject\\\",\\n\" +\n" +
            "                        \"    \\\"createdDate\\\": \\\"2019-02-05T14:34:46.233215Z\\\",\\n\" +\n" +
            "                        \"    \\\"projectPreview\\\": null,\\n\" +\n" +
            "                        \"    \\\"scenes\\\": [\\n\" +\n" +
            "                        \"        {\\n\" +\n" +
            "                        \"            \\\"position\\\": 0,\\n\" +\n" +
            "                        \"            \\\"name\\\": \\\"Scene 1\\\",\\n\" +\n" +
            "                        \"            \\\"data\\\": {\\n\" +\n" +
            "                        \"                \\\"imageActor\\\": [\\n\" +\n" +
            "                        \"                    {\\n\" +\n" +
            "                        \"                        \\\"id\\\": \\\"blablabla\\\",\\n\" +\n" +
            "                        \"                        \\\"animationId\\\": \\\"anim_1\\\",\\n\" +\n" +
            "                        \"                        \\\"depth\\\": 0.3,\\n\" +\n" +
            "                        \"                        \\\"croppingSettings\\\": null\\n\" +\n" +
            "                        \"                    }\\n\" +\n" +
            "                        \"                ],\\n\" +\n" +
            "                        \"                \\\"modelActor\\\": [\\n\" +\n" +
            "                        \"                    {\\n\" +\n" +
            "                        \"                        \\\"id\\\": \\\"5c1bcab2e63f90774e8b88a8\\\",\\n\" +\n" +
            "                        \"                        \\\"sourceType\\\": \\\"CUSTOM_MODEL\\\",\\n\" +\n" +
            "                        \"                        \\\"animationId\\\": \\\"anim_1\\\"\\n\" +\n" +
            "                        \"                    }\\n\" +\n" +
            "                        \"                ],\\n\" +\n" +
            "                        \"                \\\"templateActor\\\": [\\n\" +\n" +
            "                        \"                    {\\n\" +\n" +
            "                        \"                        \\\"id\\\": \\\"2312\\\",\\n\" +\n" +
            "                        \"                        \\\"sourceId\\\": \\\"232\\\",\\n\" +\n" +
            "                        \"                        \\\"sourceType\\\": \\\"video\\\"\\n\" +\n" +
            "                        \"                    }\\n\" +\n" +
            "                        \"                ],\\n\" +\n" +
            "                        \"                \\\"textActor\\\": [\\n\" +\n" +
            "                        \"                    {\\n\" +\n" +
            "                        \"                        \\\"message\\\": \\\"test1\\\",\\n\" +\n" +
            "                        \"                        \\\"animationId\\\": \\\"anim_1\\\",\\n\" +\n" +
            "                        \"                        \\\"regionId\\\": \\\"default\\\",\\n\" +\n" +
            "                        \"                        \\\"fontId\\\": \\\"noto_sans\\\",\\n\" +\n" +
            "                        \"                        \\\"depth\\\": 0.3,\\n\" +\n" +
            "                        \"                        \\\"color\\\": \\\"#FFFFFF\\\"\\n\" +\n" +
            "                        \"                    }\\n\" +\n" +
            "                        \"                ],\\n\" +\n" +
            "                        \"                \\\"priceActor\\\": [\\n\" +\n" +
            "                        \"                    {\\n\" +\n" +
            "                        \"                        \\\"message\\\": \\\"Some Message\\\",\\n\" +\n" +
            "                        \"                        \\\"animationId\\\": \\\"AnimId\\\",\\n\" +\n" +
            "                        \"                        \\\"colorText\\\": \\\"colorText\\\",\\n\" +\n" +
            "                        \"                        \\\"colorTag\\\": \\\"colorTag\\\",\\n\" +\n" +
            "                        \"                        \\\"priceType\\\": 1\\n\" +\n" +
            "                        \"                    }\\n\" +\n" +
            "                        \"                ]\\n\" +\n" +
            "                        \"            }\\n\" +\n" +
            "                        \"        },\\n\" +\n" +
            "                        \"        {\\n\" +\n" +
            "                        \"            \\\"position\\\": 1,\\n\" +\n" +
            "                        \"            \\\"name\\\": \\\"Scene 2\\\",\\n\" +\n" +
            "                        \"            \\\"data\\\": {\\n\" +\n" +
            "                        \"                \\\"imageActor\\\": [],\\n\" +\n" +
            "                        \"                \\\"modelActor\\\": [\\n\" +\n" +
            "                        \"                    {\\n\" +\n" +
            "                        \"                        \\\"id\\\": \\\"5c1bcaa8e63f90774e8b889b\\\",\\n\" +\n" +
            "                        \"                        \\\"sourceType\\\": \\\"CUSTOM_MODEL\\\",\\n\" +\n" +
            "                        \"                        \\\"animationId\\\": \\\"anim_2\\\"\\n\" +\n" +
            "                        \"                    }\\n\" +\n" +
            "                        \"                ],\\n\" +\n" +
            "                        \"                \\\"templateActor\\\": [],\\n\" +\n" +
            "                        \"                \\\"textActor\\\": [],\\n\" +\n" +
            "                        \"                \\\"priceActor\\\": null\\n\" +\n" +
            "                        \"            }\\n\" +\n" +
            "                        \"        },\\n\" +\n" +
            "                        \"        {\\n\" +\n" +
            "                        \"            \\\"position\\\": 2,\\n\" +\n" +
            "                        \"            \\\"name\\\": \\\"Scene 3\\\",\\n\" +\n" +
            "                        \"            \\\"data\\\": {\\n\" +\n" +
            "                        \"                \\\"imageActor\\\": [],\\n\" +\n" +
            "                        \"                \\\"modelActor\\\": [\\n\" +\n" +
            "                        \"                    {\\n\" +\n" +
            "                        \"                        \\\"id\\\": \\\"5c1bb97ae63f90cc209390a8\\\",\\n\" +\n" +
            "                        \"                        \\\"sourceType\\\": \\\"CUSTOM_MODEL\\\",\\n\" +\n" +
            "                        \"                        \\\"animationId\\\": \\\"anim_3\\\"\\n\" +\n" +
            "                        \"                    }\\n\" +\n" +
            "                        \"                ],\\n\" +\n" +
            "                        \"                \\\"templateActor\\\": [],\\n\" +\n" +
            "                        \"                \\\"textActor\\\": [],\\n\" +\n" +
            "                        \"                \\\"priceActor\\\": null\\n\" +\n" +
            "                        \"            }\\n\" +\n" +
            "                        \"        }\\n\" +\n" +
            "                        \"    ],\\n\" +\n" +
            "                        \"    \\\"mediaSettings\\\": {\\n\" +\n" +
            "                        \"        \\\"width\\\": 880,\\n\" +\n" +
            "                        \"        \\\"height\\\": 880\\n\" +\n" +
            "                        \"    },\\n\" +\n" +
            "                        \"    \\\"softwareVersion\\\": \\\"18.0921.0\\\",\\n\" +\n" +
            "                        \"    \\\"projectVersion\\\": 0\\n\" +\n" +
            "                        \"}";



}
