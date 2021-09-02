package com.myfinances.api.rest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * System:                 MyFinancesAPI
 * Name:                   BaseController
 * Description:            Abstract class that serves as proxy for all other resource controllers
 *
 * @author teixbr
 * @version 1.0
 * @since 14/08/21
 */
@RestController
@RequestMapping("/api")
public abstract class BaseController
{}
